
package javaExample.main;

import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;

public class Examlpe_Lybda_Stream {

    public static void fire (Object sender) {
        out.println("Fire");
        out.println("Fire!!!");
    }

    public static void main(String[] args) {

        Switcher switcher = new Switcher();
        switcher.addListener(new Lamp());
        switcher.addListener(new Radio());
        switcher.addListener(null);

        switcher.addListener( new ElectrocitiConsumer() {
            public void electrocitiOn(Object sender ) {
                System.out.println("Anonim On");
            }
        });

        switcher.addListener( (sender) -> System.out.println("Anonim Lymda On"));
        switcher.addListener( sender -> System.out.println("Anonim Lymda1 On"));

        switcher.addListener( s -> Examlpe_Lybda_Stream.fire(s));
        switcher.addListener( Examlpe_Lybda_Stream::fire );
        
        // (new ElectrocitiConsumer( ) {
        //     public void electrocitiOn( Object sender ) {
        //         System.out.println("Anonim On2");
        //     }
        // }).electrocitiOn(sender);

        switcher.switchOn();
    }
}

@FunctionalInterface
interface ElectrocitiConsumer {
    void electrocitiOn( Object sender );
}

class Switcher {
    

    private List<ElectrocitiConsumer> lstCunsumers = new ArrayList<>();

    public void switchOn() {
        System.out.println("Switch On");
        lstCunsumers.forEach(c -> c.electrocitiOn( this ));
    }

    public void addListener( ElectrocitiConsumer consumer ) {
        if (consumer != null) {
            lstCunsumers.add(consumer);
        } else {
            System.out.println("Null");
        }
    }

    public void removeListener(ElectrocitiConsumer consumer) {
        if (lstCunsumers.contains(consumer)) {
            lstCunsumers.remove(consumer);
        } else {
            System.out.println("No consumer ");
        }
    }

}

class Lamp implements ElectrocitiConsumer {
    @Override
    public void electrocitiOn( Object sender ) {
        lightOn();
    }

    private void lightOn() {
        System.out.println("Lamp On");
    }
}

class Radio implements ElectrocitiConsumer {
    @Override
    public void electrocitiOn( Object sender ) {
        radioOn();
    }

    private void radioOn() {
        System.out.println("Radio On");
    }
}
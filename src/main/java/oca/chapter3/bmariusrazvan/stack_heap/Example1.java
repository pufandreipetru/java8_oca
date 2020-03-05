package stack_heap;

class EnhancedFujitaScale {
    //categorize
}

class Tornado {
    EnhancedFujitaScale efs;                    //instance variable
    String location;                            //instance variable

    public static void main(String[] args) {

        Tornado t;                              //local variable: t
        t = new Tornado();
        t.spotted(t);
    }

    void spotted(Tornado tornado) {             //local variable: tornado
        efs = new EnhancedFujitaScale();
        tornado.setLocation("Oklahoma");
    }

    void setLocation(String tornadoLocation) {         //local variable: tornadoLocation
        location = tornadoLocation;
        //Other stuff
    }
}

/*
    To sum up:
        The Stack - methods (setLocation, spotted, main)
                  - local variables (t, tornado, tornadoLocation)

                  - String object ('Oklahoma')
                                        |
        The Heap  - instance variables (efs, location - Tornado object)
                                        |
                  - Collar object (empty)
 */

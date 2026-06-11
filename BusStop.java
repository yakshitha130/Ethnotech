class BusStop {
    String name;
    BusStop next;
    BusStop(String name) {
        this.name = name;
        this.next = null;
    }
    public static void main(String[] args) {
        BusStop head = new BusStop("Bus Stop");
        BusStop rS = new BusStop("RS");
        BusStop vC = new BusStop("VC");
        BusStop mits = new BusStop("MITS");
        head.next = rS;
        rS.next = vC;
        vC.next = mits;
        BusStop temp = head;
        while (temp != null) {
            System.out.print(temp.name);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
    }
}
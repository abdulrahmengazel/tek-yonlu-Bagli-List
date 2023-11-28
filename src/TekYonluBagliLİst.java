public class TekYonluBagliLİst {
    Node head = null;
    Node teil = null;

    public void ekle(int x) {
        Node elemen = new Node();
        elemen.data = x;
        if (head == null) {
            head = elemen;
            teil = elemen;
        } else {
            teil.next = elemen;
            teil = elemen;
            System.out.println("girdiniz degeri listeye eklendi");
        }
    }


    public void basaEkle(int x) {
        Node node = new Node();
        node.data = x;
        if (head == null) {
            node.next = null;
            head = node;
            teil = node;
            System.out.println("liste olsturdu ve ilk elmen eklendi");
        } else {
            node.next = head;
            head = node;
            System.out.println("listedaki bas elemen guncelledi");
        }
    }

    public void sonaEkle(int x) {
        Node node = new Node();
        node.data = x;
        if (head == null) {
            node.next = null;
            head = node;
            teil = node;
            System.out.println("liste olsturdu ve ilk elmen eklendi");
        } else {
            node.next = null;
            teil.next = node;
            teil = node;
            System.out.println("listedaki son elemen guncelledi");
        }
    }

    public void arayaEkle(int indis, int x) {
        Node node = new Node();
        node.data = x;
        if (indis == 0) {
            node.next = head;
            head = node;
            System.out.println("listedaki bas elemen guncelledi");
        } else {
            int n = 0;
            Node temp = head;
            Node temp2 = head;
            while (temp.next != null) {
                System.out.println(n);
                n++;
                temp2 = temp;
                temp = temp.next;
            }
            if (n == indis) {
                temp2.next = node;
                node.next = temp;
                System.out.println("listedaki son elemen guncelledi");
            } else {
                temp = head;
                int i = 0;
                while (i < indis) {
                    temp2 = temp;
                    temp = temp.next;
                    i++;
                }
                temp2.next = node;
                node.next = temp;
                System.out.println(indis+". indisi gucelledi");
            }

        }
    }

    public void basasil() {
        head = head.next;
        System.out.println("listedeki bas elemen silindi");
    }

    public void sonasil() {
        Node temp = new Node();
        Node temp2 = new Node();
        temp = head;
        while (temp.next != null) {
            temp2 = temp;
            temp = temp.next;
        }
        temp2.next = null;
        teil = temp2;
        System.out.println("listedeki son elemen silindi");

    }

    public void ardansil(int indis) {
        if (head == null) {
            System.out.println("liste bos ");
        } else if (head.next == null && indis == 0) {
            head = null;
            teil = null;
            System.out.println("listede son elemen silindi");
        } else if (head.next != null && indis == 0) {
            head = head.next;
            System.out.println("bastaki elemen silindi");
        } else {
            int i = 0;
            Node temp = head;
            Node temp2 = head;
            while (temp.next != null) {
                i++;
                temp2 = temp;
                temp = temp.next;
            }

            if (indis == i) {
                temp2.next = null;
                teil = temp2;
                System.out.println("listedeki son  elemen silindi");
            } else {
                temp = head;
                int j = 0;
                while (j != indis) {
                    temp2 = temp;
                    temp = temp.next;
                    j++;
                }
                temp2.next = temp.next;
                System.out.println(indis+".indis    elemen silindi");


            }

        }

    }


    public void yazdir() {
        System.out.print("head-> ");
        if (head == null) {
            System.out.println("liste bos");
        }
        Node temp = new Node();
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(" son");
    }
}
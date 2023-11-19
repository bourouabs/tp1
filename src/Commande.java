public class Commande {
    private String reference;
    private double total;
    private double totalPaye;

    public Commande() {
    }

    public Commande(String reference) {
        this.reference = reference;
    }

    public Commande(String reference, double total) {
        this.reference = reference;
        this.total = total;
    }

    public Commande(String reference, double total, double totalPaye) {
        this.reference = reference;
        this.total = total;
        this.totalPaye = totalPaye;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotalPaye() {
        return totalPaye;
    }

    public void setTotalPaye(double totalPaye) {
        this.totalPaye = totalPaye;
    }
    public void presentToi() {
        System.out.println("la ref : "+reference+" total : "+total+" et total Payé : "+totalPaye);
    }



}

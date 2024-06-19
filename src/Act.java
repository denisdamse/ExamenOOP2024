public abstract class Act {
    private String id;
    private String numarUnicIdentificare;
    public String getId() {
        return id;
    }
    public String getNumarUnicIdentificare() {
        return numarUnicIdentificare;
    }
    public Act(String id, String numarUnicIdentificare) {
        this.id = id;
        this.numarUnicIdentificare = numarUnicIdentificare;
    }
}

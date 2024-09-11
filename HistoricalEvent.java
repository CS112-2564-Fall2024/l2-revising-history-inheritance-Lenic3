public class HistoricalEvent {
    /*
     * Variables
     * - date : Date
     * - description : String
     * -----------------------------
     * Methods
     * teach()
     * get/set
     * toString()
     * equals(other : Object)
     */
    private String description;
    private Date date;

    public HistoricalEvent() {
        this.description = "None";
        this.date = new Date();
    }

    public HistoricalEvent(String description, Date date){
        this.description = description;
        this.date = date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return this.date;
    }

    public String getDescription() {
        return this.description;
    }

    public String toString() {
        return this.date.toString() + "---" + this.description;
    }

    public void teach() {
        System.out.println("====================================================");
        System.out.println("HISTORICAL EVENT:");
        System.out.println("====================================================");
        System.out.println(this.toString());
    }
    
    // public boolean equals(Object other) {
    //     HistoricalEvent otherHistoricalEvent;

    //     if (other == null) {
    //         return false;
    //     }
    //     else if (!(other instanceof HistoricalEvent)) {
    //         return false;
    //     }
    //     else {
    //         otherHistoricalEvent = (HistoricalEvent) other;
    //         return this.historicalEvent.equals(otherHistoricalEvent);
    //     }
    // }
}

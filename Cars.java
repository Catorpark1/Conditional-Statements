public class Cars {
        private String make;
        private String model;
        private int year;

        public Cars(String make, String model, int year) {
            setMake(make);
            setModel(model);
            setYear(year);
        }
        public String getMake() {
            return make;
        }
            public void setMake(String make){
                this.make = make;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
        }
        public int getYear() {
            return year;
        }
        public void setYear(int year){
            this.year = year;
        }
}
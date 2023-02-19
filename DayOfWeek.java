class DayOfWeek {
            //Creating a Method to get day Name
            public static String getDayName(int day){
                String dayName="";
                switch (day){
                    case 1: dayName = "Sunday"; 
                    break;
                    case 2: dayName = "Monday"; 
                    break;
                    case 3: dayName = "Tuessday"; 
                    break;
                    case 4: dayName = "Wednesday"; 
                    break;
                    case 5: dayName = "Thrusday"; 
                    break;
                    case 6: dayName = "Fridayday"; 
                    break;
                    case 7: dayName = "Saturday"; 
                    break;
                    default:dayName = "Invalid day range";
                }
                return dayName;
            }
    public static void main(String[] args) {
        int day = 4;
        System.out.println(getDayName(day));

    }    
}

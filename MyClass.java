import java.util.Scanner;
class PrimeManagement{
    private int primeId;
    private String userProfileName;
    private String subscriptionType;
    private double subscriptionPrice;
    private int noOfProfiles;
    
    public int getPrimeId() {
        return primeId;
    }
    public void setPrimeId(int primeId) {
        this.primeId = primeId;
    }
    public String getUserProfileName() {
        return userProfileName;
    }
    public void setUserProfileName(String userProfileName) {
        this.userProfileName = userProfileName;
    }
    public String getSubscriptionType() {
        return subscriptionType;
    }
    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }
    public double getSubscriptionPrice() {
        return subscriptionPrice;
    }
    public void setSubscriptionPrice(double subscriptionPrice) {
        this.subscriptionPrice = subscriptionPrice;
    }
    public int getNoOfProfiles() {
        return noOfProfiles;
    }
    public void setNoOfProfiles(int noOfProfiles) {
        this.noOfProfiles = noOfProfiles;
    }
}

class MyClass{
    
    static int findAveragePriceByType(PrimeManagement [] primeManagement, String type){
        int sum = 0;
        int count = 0;
        for(int i = 0; i < primeManagement.length; i++){
            if(primeManagement[i].getSubscriptionType().equals(type)){
                sum += primeManagement[i].getSubscriptionPrice();
                count++;
            }
        }
        if(sum!=0 && count!=0){
            return sum/count;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrimeManagement [] primeManagement = new PrimeManagement[4];
        for(int i = 0; i < 4; i++){
            primeManagement[i] = new PrimeManagement();
            primeManagement[i].setPrimeId(sc.nextInt());
            primeManagement[i].setUserProfileName(sc.next());
            primeManagement[i].setSubscriptionType(sc.next());
            primeManagement[i].setSubscriptionPrice(sc.nextDouble());
            primeManagement[i].setNoOfProfiles(sc.nextInt());
        }
        String type = sc.next();
        int result = findAveragePriceByType(primeManagement, type);
        if(result>0){
            System.out.println(result);
        }
        else{
            System.out.println("There are no such prime Management");
        }
        sc.close();

    }
}
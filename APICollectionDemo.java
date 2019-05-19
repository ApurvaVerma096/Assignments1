import java.util.ArrayList;
import java.util.Scanner;
class Laptop{
    private Integer ramSize, hddSize,id;
    private String brand;
 
    Laptop( int id, int ramSize, int hddSize, String brand){
        this.id = id;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.brand = brand;
        
    }
 
    //Creating the getters
    public Integer getId(){
        return this.id;
    }

    public Integer getRamSize(){
        return this.ramSize;
    }

    public Integer setRamSize(int n){
        return this.ramSize = n;
    }
 
    public Integer getHddSize(){
        return this.hddSize;
    }
    public Integer setHddSize(int n){
        return this.hddSize = n;
    }
 
    public String getBrand(){
        return this.brand;
    }
    public String setBrand(String n){
        return this.brand = n;
    }

    

    public String toString(){
        return "ID : " + this.id +"\n" + "Ram Size : " + this.ramSize + "\n" + "HardDisk Size : " + this.hddSize + "\n" + "BrandName :" + this.brand ;
    }
}
 
class APICollectionDemo{
    public static void main(String[] args) {
 
        ArrayList list = new ArrayList();

        

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a new Laptop details:");
        System.out.println("How many laptop you want to add");
        int n = scan.nextInt();
        for(int i=1 ; i<=n ; i++)
            {
            // adding new Laptop
            System.out.println("Enter the ID of your Laptop:");
            int id = scan.nextInt();
            System.out.println("Enter the Ram Size");
            int r = scan.nextInt();
            System.out.println("Enter the HDD Size");
            int hd = scan.nextInt();
            System.out.println("Enter the brand name of laptop");
            String bn = scan.next();

            list.add(new Laptop(id,r,hd,bn));
            // System.out.println("New Laptop is added by ID: " + Laptop.getId());
        }
        // System.out.println("you want to Continue or Exit : c/e");
        // char c = scan.next().charAt(0);
        // if(c = 'c'){

        // }

        System.out.println("Do you want to view the laptop details : y/n");
        char s = scan.next().charAt(0);
        if( s == 'y'){
            for (Object obj : list) {
             System.out.println(obj);
                
             }
        }
        else{
            System.out.println("Thank You :-)");
            //break;
        }

        System.out.println("How you want to search your laptop: 1. By ID \n 2. By Ram Size \n 3. By HardDisk size \n 4. By BrandName");
        int srch = scan.nextInt();
        switch(srch){
        case 1:
            System.out.println("Enter ID");
            int id = scan.nextInt();
            for (Object obj : list) {
                if(((Laptop)obj).getId().equals(id))
                System.out.println(obj);
            }
            break;
        case 2:
            System.out.println("Enter RamSize");
            int ramSize = scan.nextInt();
            for(Object obj : list){
                if(((Laptop)obj).getRamSize().equals(ramSize))
                System.out.println(obj);
            }
            break;
        case 3:
            System.out.println("Enter HardDisk");
            int hddSize = scan.nextInt();
            for(Object obj : list){
                if(((Laptop)obj).getHddSize().equals(hddSize))
                System.out.println(obj);
            }
        break;
        case 4:
            System.out.println("Enter BrandName");
            String brand = scan.next();
            for(Object obj : list){
                if(((Laptop)obj).getBrand().equals(brand))
                System.out.println(obj);
            }
        break;

        }

        System.out.println("Do you want to remove the laptop entry : y/n");
        char b = scan.next().charAt(0);
        if( b == 'y'){
            System.out.println("Enter the ID");
            int id = scan.nextInt();
            for (Object obj : list) {
                if(((Laptop)obj).getId().equals(id)){
                    list.remove(obj);
                    System.out.println("item is removed");
                }
                else{
                    System.out.println("ID Doesn't exist ")
                }

            }
               
        }
        else{
            System.out.println("Thank you :-)");
            System.exit(0);

        }
        System.out.println("Do you want to update the details of laptop : y/n");
        char r = scan.next().charAt(0);
        if(r == 'y'){
            System.out.println("Enter the id where you want to update");
            int id = scan.nextInt();
            Object newObj = null;
            for (Object obj : list) {
                if(((Laptop)obj).getId().equals(id)){
                    newObj = obj;
                    System.out.println("what you want to update : 1. RamSize \n 2. HardDisk size \n 3. BrandName");
                    int res = scan.nextInt();
                    switch(res){
                        case 1:
                            System.out.println("Enter the RamSize you want to update new");
                            int ramSize = scan.nextInt();
                    
                                ((Laptop)newObj).setRamSize(ramSize);
                                System.out.println("Ram size is updated");
                                
                            break;
                        case 2:
                        System.out.println("Enter the Harddisk size you want to update new");
                            int hddSize = scan.nextInt();
                            ((Laptop)newObj).setHddSize(hddSize);
                            System.out.println("HardDisk size is updated");
                            break;
                         case 3:
                        System.out.println("Enter the BrandName you want to update new");
                            String brand = scan.nextLine();
                            ((Laptop)newObj).setBrand(brand);
                            System.out.println("BrandName  is updated");
                            break;


                    }
                }
                else{
                    System.out.println("ID doesn't exist");
                }

                
            }


        }
        // System.out.println("Do you want to update details of laptop : y/n")
        // char e = scan.next().charAt(0);
        // if( e == 'y'){
        //     System.out.println("How you want to Delete your laptop: 1. By ID \n 2. By Ram Size \n 3. By HardDisk size \n 4. By BrandName");
        // }



        // System.out.println(n);
        // if( n == 2 ){
        //     //view the list elements
        //     for (Object obj : list) {
        //         System.out.println(obj);
                
        //     }
        //     // System.out.println("hii");
        //     // for(int i = 1 ; i< list.size() ; i++)
        //     //  {
        //     //     System.out.println("ID : " + ((Laptop)list.get(i)).getId());
        //     //     System.out.println("Ram : " + ((Laptop)list.get(i)).getRamSize());
        //     //     System.out.println("HDD Size : " + ((Laptop)list.get(i)).getHddSize());
        //     //     System.out.println("Brand : " + ((Laptop)list.get(i)).getBrand());

        //     // }
        // }
        // if( n==3 ){
        //     //Search the laptop by Id
        //     System.out.println("");
        // }
        //Laptop l = new Laptop(8, 600, "Lenovo");
 
        //Store a Laptop object in the list
//         list.add(new Laptop(4, 500, "IBM")); 
//         list.add(new Laptop(8, 800, "IBM"));
//         list.add(new Laptop(6, 500, "Sony"));
 
//         list.add(l);
 
// //Get all the details of a particular laptop
// System.out.println("Second Laptop Details : ");
 
// System.out.println("Ram : " + ((Laptop)list.get(1)).getRamSize());
// System.out.println("HDD Size : " + ((Laptop)list.get(1)).getHddSize());
// System.out.println("Brand : " + ((Laptop)list.get(1)).getBrand());
 
 
    }
}
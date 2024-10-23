/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author DFCAMCLP-IT
 */
public class Arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num,arr_type,choice,add_el,del,update,new_el,search;
        String again;
        int [] arr = new int [20];
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        System.out.print("Enter number of elements: ");
        num = input.nextInt();
        do{
            System.out.println("1.Array\n2.ArrayList");
            System.out.print("Enter your array type: ");
            arr_type = input.nextInt();
            switch(arr_type){
                case 1:
            do{
                System.out.println("Main Menu\n1.Add Element\n2.View Element\n3.Delete Element\n4.Update Element\n5.Search\n6.IndexOf\n7.Clear\n8.isempty");
                System.out.print("Enter your choice: ");
                choice = input.nextInt();
                   switch(choice){
                    case 1:
                        for(int i =0; i<num; i++){
                            System.out.print("Enter array[" + i + "]: ");
                            arr[i] = input.nextInt();
                        }
                        break;
                    case 2:
                        for(int i =0; i<num; i++){
                            System.out.println(arr[i] + " ");
                        }
                        break;
                    case 3:
                        System.out.print("Enter element position u want to remove: ");
                        del = input.nextInt();
                        while (del<num){
                            arr[del-1]=arr[del];
                            del=del+1;
                        }
                        num = num -1;
                            break;
                    case 4:
                        System.out.print("Enter element position u want to update: ");
                        update = input.nextInt();
                        System.out.print("Enter element you want to in: ");
                        new_el = input.nextInt();

                        for(int i =0; i<num; i++){
                           arr[update - 1]=new_el;
                           System.out.println(arr[i]);
                        }
                        break;

                    case 5:
                        System.out.print("Enter element u want to search:");
                        search = input.nextInt();
                        boolean found = false;
                        for(int i =0; i<num; i++){
                            if(arr[i] == search){
                                found = true;
                            }
                        }
                        if(found){
                            System.out.println("Element "+search+" is found");
                        }
                        else{
                           System.out.println("Element "+search+" is not found"); 
                        }
                        break;
                    case 6:
                        System.out.print("Enter element u want to search:");
                        search = input.nextInt();
                        for(int i =0; i<num; i++){
                            if(arr[i] == search){
                                System.out.println("The " + search + "is in index " + i);
                            }
                        }
                        break;
                    case 7:
                        Arrays.fill(arr,0);
                        break;
                    case 8:
                        boolean isempty = false;
                        for(int i =0; i<num; i++){
                            if(arr[i] == 0){
                                isempty = true;
                            }
                        }
                        if(isempty){
                            System.out.println("true");
                        }
                        else{
                            System.out.println("false");
                        }
                        break;
                    default:
                        System.out.println("Invalid input");
                   }   
                   System.out.print("Do you want to continue(y/n)?");
                   again = input.next();

            }
            while(again.equalsIgnoreCase("y"));
            break;
            
            case 2:
                do{
                    System.out.println("Main Menu\n1.Add Element\n2.View Element\n3.Delete Element\n4.Update Element\n5.Search\n6.IndexOf\n7.Clear\n8.isempty");
                    System.out.print("Enter your choice: ");
                    choice = input.nextInt();
                    switch(choice){
                        case 1:
                            for(int i = 0; i<num; i++){
                                System.out.print("Enter element: ");
                                add_el = input.nextInt();
                                arrList.add(add_el);
                            }
                            break;
                        case 2:
                            System.out.println(arrList);
                            break;
                        case 3:
                            System.out.print("Enter position number to delete: ");
                            del = input.nextInt();
                            arrList.remove(del-1);
                            break;
                        case 4:
                            System.out.print("Enter position number to update: ");
                            update = input.nextInt();
                            System.out.print("Enter new element U want to in: ");
                            new_el = input.nextInt();
                            arrList.set(update-1,new_el);
                            break;
                        case 5:
                            System.out.print("Enter element u want to search:");
                            search = input.nextInt();
                            boolean found = false;
                            for(int i =0; i<num; i++){
                                if(arr[i] == search){
                                    found = true;
                                }
                            }
                            if(found){
                                System.out.println("Element "+search+" is found");
                            }
                            else{
                               System.out.println("Element "+search+" is not found"); 
                            }
                            break;
                        case 6:
                            System.out.print("Enter element U want to search: ");
                            search = input.nextInt();
                            for(int i = 0; i<num; i++){
                                if(search == arrList.get(i)){
                                    System.out.println("Element "+search+" is found at index " + i);
                                }
                            }
                        case 7:
                            arrList.clear();
                            break;
                        case 8: 
                                if(arrList.size()==0){
                                    System.out.println("true");
                                }
                                else{
                                    System.out.println("false");
                                }
                                break;
                        default:
                            System.out.println("Invalid Input");
                    }
                    System.out.print("Do you want to continue(y/n)?");
                    again = input.next();
                }
                while(again.equalsIgnoreCase("y"));
                break;
            }
            System.out.print("\nDo you want to try the other type of array(y/n)?");
            again = input.next();
        }
        while(again.equalsIgnoreCase("y")); 
    }
}


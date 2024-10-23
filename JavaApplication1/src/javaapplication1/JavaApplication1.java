package javaapplication1;
import java.util.Scanner;
import java.util.ArrayList;

public class JavaApplication1 {
    public static void main(String[] args) {
       int n,n1,choice,ele,del,pos,upd,find,ind,choice2;
       String again;
       int[] arr1 = new int[20];
       Scanner in = new Scanner(System.in);
       ArrayList<Integer> arr  = new ArrayList<>();
       System.out.print("Enter number of elements: ");
       n = in.nextInt();
       do{
       System.out.print("[1] Array\n[2] ArrayList\nSelect choice: ");
       choice2 = in.nextInt();
        switch(choice2){
           case 1:
               do{
                   System.out.print("MAIN MENU\n[1] Add\n[2] View all\n[3] Delete\n[4] Update\n[5] Search\n[6] IndexOf\n[7] Clear\n[8] isEmpty\nSelect choice: ");
                    choice = in.nextInt();
                    switch(choice){
                        case 1:
                            for (int i = 0; i<n; i++){
                                System.out.print("Enter element of Array: ");
                                arr1[i] = in.nextInt();    
                            }
                            break;
                        case 2:
                            System.out.println("ALL ELEMENTS: ");
                                for (int i = 0; i<n; i++){ 
                                    if (arr1[i] != 0){
                                    System.out.println(arr1[i]);
                            }
                                }
                            break;
                        case 3:
                            System.out.print("Enter position of number to delete: ");
                            del = in.nextInt();
                            while (del<n){
                                arr1[del-1] = arr1[del];
                                del = del + 1;
                            }
                            n=n-1;
                            break;
                        case 4:
                            System.out.print("Enter position to update: ");
                            pos = in.nextInt();
                            System.out.print("Enter number: ");
                            upd = in.nextInt();
                            arr1[pos-1]=upd;
                            break;
                        case 5: 
                            System.out.print("Enter number to search: ");
                            find = in.nextInt();
                            n=n+1;
                            int i;
                            for (i = 0; i<n; i++){
                                if (arr1[i]==find){
                                    break;
                                }
                            }
                            System.out.println("Element "+find+" is in position "+(i+1));
                            break;
                        case 6: 
                            System.out.print("Enter number to search: ");
                            ind = in.nextInt();
                            int x;
                            for (x = 0; x<n; x++){
                                if (arr1[x]==ind){
                                    break;
                                }
                            }
                            System.out.println("Element "+ind+" is in position "+x);
                            break;
                        case 7:
                            for(int j=0; j<n; j++){
                                arr1[j]=0;
                            }
                            break;

                        case 8:
                            boolean isEmpty = true;
                            for (int j = 0; j<n;j++){
                                if (arr1[j]!=0){
                                    isEmpty = false;
                                    break;
                                }
                            }
                            System.out.println(isEmpty? "True" : "False");
                    }
                    System.out.println("Do you want to try again? (Y/N): ");
                    again = in.next();
               }while(again.equalsIgnoreCase("y"));
               break;
           case 2:
                do{
                   System.out.print("MAIN MENU\n[1] Add\n[2] View all\n[3] Delete\n[4] Update\n[5] Search\n[6] IndexOf\n[7] Clear\n[8] isEmpty\nSelect choice: ");
                    choice = in.nextInt();
                    switch(choice){
                        case 1:
                            for (int i = 0; i<n; i++){
                                System.out.print("Enter element of Array List: ");
                                ele = in.nextInt();
                                arr.add(ele);
                            }
                            break;
                        case 2:
                            for (int i = 0; i<n; i++){
                                System.out.println(arr.get(i));
                            }
                            break;
                        case 3:
                            System.out.print("Enter position of number to delete: ");
                            del = in.nextInt();
                            arr.remove(del-1);
                            n = n-1;
                            break;
                        case 4:
                            System.out.print("Enter position to update: ");
                            pos = in.nextInt();
                            System.out.print("Enter number: ");
                            upd = in.nextInt();
                            arr.set(pos-1, upd);

                            break;
                        case 5: 
                            System.out.print("Enter number to search: ");
                            find = in.nextInt();
                            for (int i = 0; i<n; i++){
                                if (arr.get(i)==find){
                                    System.out.print("The position of "+find+"is in "+(i+1));
                                }
                            }
                            break;
                        case 6: 
                            System.out.print("Enter number to search: ");
                            ind = in.nextInt();
                            for (int i = 0; i<n; i++){
                                if (arr.get(i)==ind){
                                    System.out.println("The position of "+ind+"is in "+(i));
                                }
                            }
                            break;
                        case 7:
                            arr.clear();
                            break;

                        case 8:
                            System.out.println(arr.isEmpty());
                            break;
                    }System.out.println("Do you want to try again? (Y/N): ");
                    again = in.next();
               }while(again.equalsIgnoreCase("y"));
                break;
           
       }System.out.println("Do you want to go back? (Y/N): ");
                again = in.next();
               }while(again.equalsIgnoreCase("y"));
    }
}


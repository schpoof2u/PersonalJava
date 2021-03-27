package com.udemy.java.shikhar.section5;

public class CodingExercise24 {
    //Challenge Description:
    //Write a method named canPack with three parameters of type int named bigCount, smallCount, and goal.
    //
    //The parameter bigCount represents the count of big flour bags (5 kilos each).
    //
    //The parameter smallCount represents the count of small flour bags (1 kilo each).
    //
    //The parameter goal represents the goal amount of kilos of flour needed to assemble a package.
    //
    //Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal. The method should return true if it is possible to make a package with goal kilos of flour.
    //
    //If the sum is greater than goal, ensure that only full bags are used towards the goal amount. For example, if goal = 9, bigCount = 2, and smallCount = 0, the method should return false since each big bag is 5 kilos and cannot be divided. However, if goal = 9, bigCount = 1, and smallCount = 5, the method should return true because of 1 full bigCount bag and 4 full smallCount bags equal goal, and it's okay if there are additional bags left over.
    //
    //If any of the parameters are negative, return false.
    //
    //
    //EXAMPLE INPUT/OUTPUT:
    //
    //* canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.
    //
    //* canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.
    //
    //* canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos, and we have 1 bag left which is ok as mentioned above.
    //
    //* canPack (2, 2, 11); should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos.
    //
    //* canPack (-3, 2, 12); should return false since bigCount is negative.
    //
    //
    //NOTE: The method canPack should be defined as public static like we have been doing so far in the course.
    //
    //NOTE: Do not add a main method to the solution code.
    public static void main(String[]args){
        System.out.println(canPack(2, 1, 5));
        System.out.println(canPack(-3, 2,12));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(1,0,5));//ended at 9
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(5, 3, 24));
        System.out.println(canPack(1,0,5));//ended at 9
        System.out.println(canPack(4, 18, 19));//ended at 5
    }
    public static boolean canPack(int bigCount,int smallCount,int goal){
        if(bigCount<0 || smallCount<0 || goal<0){
            System.out.print( 0);
            return false;
        }
        if((bigCount*5)+smallCount<goal){
            System.out.print( 1);
            return false;
        }
        int remaingKilos=goal-smallCount;
        //else if((bigCount*5)+smallCount>=goal){
        if((bigCount*5)>goal){
            if(goal%5==0){
                if(goal/5>0){
                    System.out.print( 2);
                    return true;
                }
            }
            else if(goal%5!=0){
                if(remaingKilos%5==0){
                    if(bigCount>=(remaingKilos/5)){
                        System.out.print( 3);
                        return true;
                    }
                    else{
                        System.out.print( 4);
                        return false;
                    }
                }
                else if(remaingKilos%5!=0){
                    System.out.print(5);
                    int i=5;
                    while(i<goal){
                        i+=5;
                    }
                    int newGoal=goal-i;
                    System.out.println("new goal equals "+newGoal);
//                    i=1;
//                    while(i<=newGoal){
//                        i++;
//                        if((newGoal-i)==0){
//                            System.out.println("k");
//                            return true;
//                        }
//                        else{
//                            System.out.println("j");
//                            continue;
//                        }
//                    }
                    System.out.println("f");
                    return false;
                }
                else{
                    System.out.print( 6);
                    return false;
                }
            }
        }
        else if((bigCount*5)<goal){
            remaingKilos=goal-(bigCount*5);
            if(smallCount>=remaingKilos){
                System.out.print( 7);
                return true;
            }
            else{
                System.out.print( 8);
                return false;
            }
        }
        else if((bigCount*5)==goal && smallCount==0){
            System.out.print( 9);
            return true;
        }
        System.out.print( 10);
        return false;
    }
    // else if(bigCount<(goal/5)){
    //     if(smallCount==0){
    //         return false;
    //     }
    //     else if(smallCount!=0){
    //         int remainingKilos=(goal-smallCount)/5;
    //         if(remainingKilos>bigCount){
    //             return false;
    //         }
    //         else{
    //             return true;
    //         }
    //     }
    //     else{
    //         return false;
    //     }
    // }
    // else if(bigCount==0){
    //     if(smallCount<goal){
    //         return false;
    //     }
    //     else if(smallCount>goal){
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }
    //     return false;
}

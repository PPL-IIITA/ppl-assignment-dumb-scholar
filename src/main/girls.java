/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author boris12
 */
public class girls {
    
    String name;
    String bf;
    int intelligence;
    int budget;
    int attractiveness;
    int rel_type=0;
    
    public void gProp(String n,int b,int a,int intel){
        
        name=n;
        budget=b;
        attractiveness=a;
        intelligence=intel;                   
    }
    
     public boolean Is_my_type(int cost){
        if(cost > budget)
            return true;
        
        return false;
    }
    
    public int maintanence(){
        return budget;
    }
    public int attract(){
        return attractiveness;
    }
    public String name(){
        return name;
    }
    
    public int status(){
        return rel_type;
    }
    
    public void setStatus(int n){
         rel_type=n;
    }
    
}

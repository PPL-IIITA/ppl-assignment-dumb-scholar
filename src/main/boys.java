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
public class boys {
    
    String name;
    String gf;
    int intelligence;
    int budget;
    int attractiveness;
    int attraction_requirement;
    int rel_type=0;
    
    public void bProp(String n,int b,int a,int intel,int req){
    
        name=n;
        budget=b;
        attractiveness=a;        
        intelligence=intel;     
        attraction_requirement=req;
    }
    
    public boolean Is_my_type(int maintenance,int attractive){
        if(maintenance <= budget && attractive >= attraction_requirement){
            return true;
        }
        
        return false;
    }
    
    public int maintanence(){
        return budget;
    }
    
     public int status(){
        return rel_type;
    }
     
     public void setStatus(int n){
         rel_type=n;
    }

     
    public String name(){
        return name;
    }
}


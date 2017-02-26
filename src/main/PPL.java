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
import java.io.*;
import java.io.BufferedReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PPL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String boysCSV="C:\\Users\\boris12\\Documents\\NetBeansProjects\\PPL\\src\\main\\boys.csv";
        String girlsCSV="C:\\Users\\boris12\\Documents\\NetBeansProjects\\PPL\\src\\main\\girls.csv";
        String bProp="";
        String gProp="";
        String splitBy=",";
        
        String bname="";
        int battractiveness = 0 ;
        int bmaintanance = 0;
        int bintelligence = 0;
        int brequire=0;
        
        String gname="";
        int gattractiveness = 0 ;
        int gmaintanance = 0;
        int gintelligence = 0;
        
        boys BOYS[] = new boys[100];
        girls GIRLS[] = new girls[100];
        
           int g=0;
           try (BufferedReader br = new BufferedReader(new FileReader(girlsCSV))) {
            while ((gProp = br.readLine()) != null) {
                GIRLS[g]=new girls();
                String[] girl = gProp.split(splitBy);
                gname = girl[0];
                gmaintanance = Integer.parseInt(girl[1]);
                gattractiveness = Integer.parseInt(girl[2]);                
                gintelligence = Integer.parseInt(girl[3]);
                GIRLS[g++].gProp(gname, gmaintanance, gattractiveness,gintelligence );
            }
        }catch (IOException e) {
            e.printStackTrace();
        
        }
        int b=0;
        try (BufferedReader br = new BufferedReader(new FileReader(boysCSV))) {
            while((bProp = br.readLine()) != null) {
                String[] boy = bProp.split(splitBy);
                BOYS[b]=new boys();
                bname = boy[0];
                bmaintanance = Integer.parseInt(boy[1]);
                battractiveness = Integer.parseInt(boy[2]);                
                bintelligence = Integer.parseInt(boy[3]);
                brequire=Integer.parseInt(boy[4]);
            } BOYS[b++].bProp(bname,bmaintanance,battractiveness,bintelligence,brequire); 
        }catch (IOException e) {
            e.printStackTrace();
        }
        
        int k,l;
	for(k=0;k<b;k++){
		for(l=0;l<g;l++){
                    if(BOYS[k].Is_my_type(GIRLS[l].maintanence(),GIRLS[l].attract())  && GIRLS[l].status() == 0  && BOYS[k].status() == 0){
			BOYS[k].gf = GIRLS[l].name();
			GIRLS[l].bf = BOYS[k].name();
			BOYS[k].setStatus(1);
			GIRLS[l].setStatus(1);
                        System.out.println(GIRLS[l].name+" and "+BOYS[k].name+" are in a relationship.");
                    }                        
                }
            } 
        }      
    }

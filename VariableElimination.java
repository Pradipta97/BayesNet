package BayesNet;


import javafx.scene.control.Tab;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class VariableElimination {


    //will move later

    HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

    private int address = 0;



    public static ArrayList<Variables> list;
    public static ArrayList<Table> table = new ArrayList<Table>();
    public static ArrayList<Variables> evidenceList;
    public static ArrayList<Variables> variables;


    int tableLength = table.size();

    private static ArrayList<Integer> list1 = new ArrayList<Integer>();
    private static ArrayList<Integer> list2 = new ArrayList<Integer>();




    //variable class
    static class Variables
    {
        ArrayList<Variables> neighbours;
        boolean evidence;
        int scope, uniqueID;



        public Variables(int scope, int uniqueID)
        {
            this.scope = scope;
            this.uniqueID = uniqueID;
            this.evidence = false;
            this.neighbours = new ArrayList<Variables>();
        }



    }


    static class Table
    {
        int data;
        boolean bool;




        public Table(int data, boolean bool)
        {
            this.data = data;
            this.bool = bool;


        }
    }

    public VariableElimination(VariableElimination elimination)
    {
        this.list = elimination.list;
        this.table = elimination.table;
        this.evidenceList = elimination.evidenceList;

    }

    public VariableElimination()
    {
        //initialize arraylists
    }



    public static void ELIMINATE()
    {
        ArrayList<Variables> omegaTester;

        int length = table.size();

        int val = 1;

        for(int i = 0; i < variables.size(); i++)
        {
            list2.add(list.indexOf(variables.get(i)));

        }

        for(int i = 0; i < variables.size(); i++)
        {
           for(int j = list.size()-1; j>=0; j--)
           {
              val = list.get(j).scope;
           }

           list2.add(val);


        }

        for(int i = length -1; i>=0; i--)
        {
            for(int j  = 0; j < variables.size(); j++)
            {

            }
        }

        for(Variables variable : variables)
        {
            if(evidenceList.contains(variable))
            {
                evidenceList.remove(variables);
            }
        }
    }


    private int getAddress(HashMap<Integer, Integer> hashmap)
    {
        
        
        for (Variables variables: list)
        {
            int length =  tableLength/variables.scope; 
            
        }


        return 0;
        
    }


    private void add(Variables variable)
    {
        int length;

       if(list.contains(variable)==false)
       {
           list.add(variable);

           length = this.tableLength;

           if(length==0)
           {
               length = 1;
           }

           for(int i = 0; i < variable.scope*tableLength; i++)
           {

               table.add(new Table(1, false));
           }




       }
    }


    public void removeVariable(VariableElimination e, VariableElimination.Variables variables)
    {

    }



    public int get(HashMap<Integer , Integer> hashMap)
    {
        int size;
        for(Variables variables: list)
        {
            int length = tableLength/variables.scope;


        }

        return address;
    }


    public HashMap<Integer, Integer> hashMap(int variable)
    {

        int size = tableLength; 
        
        for(Variables variables : list)
        {
            int length = size/variables.scope; 
            int val = address/length;
            hashmap.put(variables.uniqueID, val);
            size = length; 
        }

        return hashmap;
    }





}

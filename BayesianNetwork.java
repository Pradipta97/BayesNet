package BayesNet;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public  class BayesianNetwork {
    VariableElimination variables;

    private static int totalVariables;

    ArrayList<VariableElimination.Variables> list = new ArrayList<VariableElimination.Variables>();
    ArrayList<VariableElimination> list2 = new ArrayList<VariableElimination>();

    PriorityQueue<VariableElimination.Variables> min;


    String bayesNet;

    static int factor = 0;


    public void readFile(String networkFileName) {
        try {
            Scanner sc = new Scanner(new File(networkFileName));

            networkFileName = sc.next();
            totalVariables = sc.nextInt();

            for (int i = 0; i < totalVariables; i++) {
                list.add(new VariableElimination.Variables(sc.nextInt(), i));
                {

                }
            }

            factor = sc.nextInt();


            for (int i = 0; i < factor; i++) {
                list2.add(new VariableElimination());
            }

            factor = 0;

            for(int i = 0; i < list2.size(); i++)
            {
                factor = sc.nextInt();

                for(int j = 0; j < factor; j++)
                {
                    list2.get(i).list.add(list.get(sc.nextInt()));

                }
            }
        } catch (FileNotFoundException e) {

        }
    }


    public void writeOutput()
    {

    }


    private void addVertices() {
        VariableElimination.Variables a, b;

        for (VariableElimination e : list2) {
            for (int i = 0; i < list.size() - 1; i++) {
                a = VariableElimination.list.get(i);


                for (int j = i + 1; j < list.size(); j++) {
                    b = VariableElimination.list.get(j);
                }


                for (VariableElimination.Variables variable : list) {
                    min.add(variable);
                }

            }
        }
    }

        private void addEdges (VariableElimination.Variables variables)
        {
            VariableElimination.Variables a, b;

            for (int i = 0; i < list.size() - 1; i++) {
                a = list.get(i);

                min.remove(a);

                for (int j = i + 1; i < list.size(); j++) {
                    b = list.get(j);
                }


            }

            // min.add(a);

        }
    }



package HW.Store;

import HW.Flowers.Chamomile;
import HW.Flowers.Flowers_null;
import HW.Flowers.Rose;
import HW.Flowers.Tulip;

public class FlowerStore implements FlowerStore_null {

    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //Variable


    private double money;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //Function

    protected void addmoney(Flowers_null... fl) {


        for (Flowers_null f : fl) {

            money += f.getPriceFlower();

        }


    }

    //---------------------------------------------------------------
    public Flowers_null[] sell(int Rose, int Chamomile, int Tulip) {

        Flowers_null[] ret = new Flowers_null[

                (notNegetiveValue(Rose) + notNegetiveValue(Chamomile) + notNegetiveValue(Tulip))
                ];

        int i = 0;
        while (i < Rose) {
            ret[i] = new Rose();
            i++;
        }


        while (i < Rose + Chamomile) {
            ret[i] = new Chamomile();
            i++;
        }


        while (i < Rose + Chamomile + Tulip) {
            ret[i] = new Tulip();
            i++;
        }


        addmoney(ret);
        return ret;
    }


    //-----------------------------------------------------------------------
    public Flowers_null[] sellSequence(int Rose, int Chamomile, int Tulip) {

        Flowers_null[] ret = new Flowers_null[

                (notNegetiveValue(Rose) + notNegetiveValue(Chamomile) + notNegetiveValue(Tulip))
                ];

        int i = 0;
        while (i < ret.length) {

            if (Rose > 0) {

                ret[i] = new Rose();
                i++;
                Rose--;
            }


            if (Chamomile > 0) {

                ret[i] = new Chamomile();
                i++;
                Chamomile--;

            }

            if (Tulip > 0) {

                ret[i] = new Tulip();
                i++;
                Tulip--;

            }


        }


        addmoney(ret);
        return ret;
    }


    //--------------------------------------------------------------------------

    private int notNegetiveValue(int i) {
        return ((i < 0) ? 0 : i);
    }


    //------------------------------------------------------------------
    public String flowersToStrin(Flowers_null... fl) {

        if (fl == null) {

            return "< Array flowers is empty >";
        } else {

            StringBuffer sb = new StringBuffer("Array of flowers :");
            for (Flowers_null f : fl) {


                sb.append("\n");
                if (f == null) {
                    sb.append("<null>");
                } else {

                    sb.append("Name : \"");
                    sb.append(f.getNameFlower());
                    sb.append("\" Price : ");
                    sb.append(f.getPriceFlower());


                }

            }
            return sb.toString();
        }

    }


}

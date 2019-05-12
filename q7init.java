import java.io.*;
import java.util.*;
public abstract class q7init{
    private double roi;
    private String bankname;
    public q7init(String bankname, double roi){
        this.bankname = bankname;
        this.roi = roi;
    }
    public abstract void show_roi(String bankname, double roi);
    public String toString(){
        return "bankname"+this.bankname;
    }
    public double todouble(){
        return "roi"+this.roi;
    }
    public void chng_roi(double new_roi){
        this.roi = new_roi;
    }
}
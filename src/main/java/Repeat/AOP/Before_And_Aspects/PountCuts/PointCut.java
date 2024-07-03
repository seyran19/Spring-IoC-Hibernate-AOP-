package Repeat.AOP.Before_And_Aspects.PountCuts;

import org.aspectj.lang.annotation.Pointcut;


public class PointCut {
    @Pointcut("execution(* getA*(..))")
    public void allGetMethods(){
    }
    @Pointcut("execution(* getTitle(..))")
    public void forGetTitle(){}



}

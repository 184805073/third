﻿简单工厂模式：
public abstract class Tv{
  public abstract void play();
}
public class HaierTv extends Tv{
  public void play(){
  System.out.println("This is HaierTv.");
  }
}
public class HisenseTv extends Tv{
  public void play(){
  System.out.println("This is HisenseTv.");
  }
}
public class TVFactory{
   public static Tv produceTv(String brand){
   if(brand.equals("HaierTv"))
      return new HaierTv();
   if(brand.equals("HisenseTv"))
    return new HisenseTv();
    return null;
   }
}
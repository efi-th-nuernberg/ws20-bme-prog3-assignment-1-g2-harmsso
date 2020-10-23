class Zahlenfilter {

  public static void filter(int i){
    if(durchFuenfTeilbar(i)){
      System.out.println(i + " ist durch 5 teilbar!/n");
    }
    if(zahlEndetAufNeun(i)){
      System.out.println(i + " endet auf Neun!/n");
    }
    if(zahlPlusVorgaengerDurchDreiTeilbar(i)){
      System.out.println(i + " plus " + (i-1) + " ergibt " + (i+(i-1)) + " und ist durch 3 teilbar!/n");
    }
  }

  private static boolean durchFuenfTeilbar(int i){
    if(i % 5 == 0){
      return true;
    }
    return false;
  }
  
  private static boolean zahlEndetAufNeun(int i){
    if(i == 9 || i % 10 == 9){
      return true;
    }
    return false;
  }

  private static boolean zahlPlusVorgaengerDurchDreiTeilbar(int i){
    if((i + (i -1)) % 3 == 0){
      return true;
    }
    return false;
  }


}
class funciones {
  public static void main(String[] args) {
    int precio = 19;
    System.out.println(ivaPrecio(precio));
    
  }
  public int  ivaPrecio (int precio){
    // NO se que es un IVA XDDDDD lo pondre con IGV como en mi pais :3
    return precio += precio*18;
  }
}

class Database {
   private static Database dbObject;

   private Database() {      
   }

   public static Database getInstance() {
      if(dbObject == null) {
         dbObject = new Database();
      }


       return dbObject;
   }

   public void getConnection() {
       System.out.println("Ahora estas conectada a la base de datos.");
   }
}

class Main {
   public static void main(String[] args) {
      Database db1;
      db1= Database.getInstance();
      db1.getConnection();
   }
}


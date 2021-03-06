package model;
import java.util.ArrayList;
import java.util.List;

public abstract class Dados {
	
	// classe que vai servir como banco de dadaos para app
	
	private static final ArrayList<Admin> admins = new ArrayList<>();
    private static final ArrayList<Client> clientes = new ArrayList<>();
    private static final ArrayList<Pagamento> pagamentos = new ArrayList<>();
    private static final ArrayList<Car> cars = new ArrayList<>();
    private static final ArrayList<Endereco> enderecos = new ArrayList<>();
    private static final ArrayList<Emprestimo> emprestimos = new ArrayList<>();
    
    private Dados() {}
        
    public static void start() {
    	
    
    		
    Admin admin = new Admin("admin", "admin");
    admins.add(admin);
    
    Client client1 = new Client("a","bfdsf","bfd","v","dgfc");
    Client client2 = new Client("adfds","b","bfgfd","dfgv","cdgf");
    Client client3 = new Client("basic","b","dfgb","dfgv","dgfc");
    Client client4 = new Client("pillow","b","gdfgb","fdgv","dfgc");
    Client client5 = new Client("gown","b","bgdf","dgfv","cdfg");
    Client client6 =new Client();
    
    clientes.add(client1);
    clientes.add(client2);
    clientes.add(client3);
    clientes.add(client4);
    clientes.add(client5);
    clientes.add(client6);
  


    
   
    
    Car car1 = new Car("any","random","good","sds",true);
    Car car2 = new Car("gfg","gfgfg","fgfg","dfdf",true);
    Car car3 = new Car("gfgf","jhj","ghf","fgfdg",true);
    Car car4 = new Car("fgdfg","rt5gf","fgfg","gfgf",true);
    cars.add(car1);
    cars.add(car2);
    cars.add(car3);
    cars.add(car4);


    }

    


    
  
    
    
  
    
    
    
    public static List<Admin> getAdmin() {
        return admins;
    }
    
    public static List<Client> getClientes() {
        return clientes;
    }
    
    public static List<Car> getCars(){
    	return cars;
    }
    public static List<Emprestimo> getEmprestimo(){
    	return emprestimos;
    }
    public static List<Pagamento> getPagamentos(){
    	return pagamentos;
    }
    public static List<Endereco> getEndereco(){
    	return enderecos;
    }
    
    
    
    
    
    public static Client selecionarPorNomeESenha(Client cliente) {
        for (Client c : Dados.clientes) {                                 //c referindo cada objeto do cliente em array<client>
            if (nomeESenhaIguaisCliente(c, cliente)) {
                return c;
            }
        }
        return null;
    }
    private static boolean nomeESenhaIguaisCliente(Client cliente, Client clienteProcura) {
        return cliente.getNome().equals(clienteProcura.getNome()) && cliente.getSenha().equals(clienteProcura.getSenha());
    }
    
    public static List<Client> selecionaTudo() {
        return Dados.getClientes();
    }
    
    //admin
    
    public static Admin buscarAdmin(Admin admin) {
        for (Admin a : Dados.getAdmin()) {
            if (nomeESenhaIguaisAdmin(a, admin)) {                   //a referindo cada objeto admin in array
                return a;
            }
        }

        return null;
    }
        private static boolean nomeESenhaIguaisAdmin(Admin admin, Admin adminProcura) {
            return admin.getNome().equals(adminProcura.getNome()) && admin.getSenha().equals(adminProcura.getSenha());
        }
    
  
    

}


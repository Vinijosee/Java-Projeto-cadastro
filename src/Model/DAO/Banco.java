/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;


import Model.Fornecedor;
import Model.Estoque;
import Model.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author Vinicius Jose
 */
public class Banco {
    
    public static ArrayList<Funcionario> funcionario;
    public static ArrayList<Fornecedor> fornecedor;
    public static ArrayList<Estoque> estoque;
    
    
    
    public static void inicia(){
    
        //Instancia os Objetos
        funcionario = new ArrayList<Funcionario>();
        fornecedor = new ArrayList<Fornecedor>();
        estoque = new ArrayList<Estoque>();
        
        
        //criando elementos
        
        Funcionario Funcionario1 = new Funcionario(101001, "Gustavo Nunes", 'M', "09/05/1996", "(21) 98692-1830", "GustavoN@gmail.com", "467.608.188-06", "75395146", "RH");
        Funcionario Funcionario2 = new Funcionario(101002, "Franscico Anderson", 'M', "20/02/1995", "(21) 98190-9010", "Franander@hotmail.com", "852.963.741-88", "95185236", "Operador de Empilhadeira");
        Funcionario Funcionario3 = new Funcionario(101003, "Jessica Lopes", 'F', "14/04/2000", "(21) 98814-8918", "jessicaL@gmail.com", "451.244.123-91", "84579612", "Estoquista");
        Funcionario Funcionario4 = new Funcionario(101004, "Otavio Marques", 'M', "19/01/2000", "(21) 90914-0918", "OtavioM@gmail.com", "223.225.920-05", "54579612", "Gerente");
        Funcionario Funcionario5 = new Funcionario(101005, "Judite Oliveiras", 'F', "30/08/1994", "(21) 98343-8661", "juditeoliveirapet@gmail.com", "792.627.482-80", "89812300", "Supervisora");
       

        
        Fornecedor Fornecedor1 = new Fornecedor(1, "KT Equipamentos", "(11)3569-2951", "ktequipamentos@gmail.com", "Av. Líder 2710,Cidade Líder SP ", "09.526.758/0001-32");
        Fornecedor Fornecedor2 = new Fornecedor(2, "Rei do EPI", "(21)2585-6010", "ReidoEpis@equipa@gmail.com", "Rua Figueira de Melo 310,São Cristovão RJ ", "17.147.144/0001-78");
        Fornecedor Fornecedor3 = new Fornecedor(3, "SuperEPI", "(11)2628-0085", "Epi@super@gmail.com", "Rua Doze de Setembro 856,Vila Guilherme SP ", "33.454.990/0001-97");
        Fornecedor Fornecedor4 = new Fornecedor(4, "Benjamin e Raul eletronicos", "(21) 99521-2562", "presidencia@breletronicos.com", "Rua Diamante 740, Bangu Rj", "46.870.397/0001-73");
        Fornecedor Fornecedor5 = new Fornecedor(5, "Pietro e Eduarda Gráfica", "(21) 98902-7893", "atendipietroeeduarda@gmail.com", "Rua Saturnino dos Santos 433 ,Sepetiba RJ ", "45.905.491/0001-58");
        Fornecedor Fornecedor6 = new Fornecedor(6, "Daiane e Edson Assessoria Jurídica", "(21) 98345-5500", "juridicoepis@gmail.com", "Travessa Osmani Mastrângelo 933, Paraiso Rj", "72.288.895/0001-12");
        Fornecedor Fornecedor7 = new Fornecedor(7, "Heloise e Manoel Ferragens Ltda", "(27) 99300-2706", "orcamento@heloemanoelferragens.com", "R. Governador Mário Covas 273,Litorâneo ES ", "13.191.597/0001-40");
        Fornecedor Fornecedor8 = new Fornecedor(8, "Contábil Epis LTDA", "(27) 99315-3709", "contabilepis@gmail.com.br", "Rua Sítio Boa Esperança 519,Três Rios RJ", "16.501.616/0001-86");
        Fornecedor Fornecedor9 = new Fornecedor(9, "Epis Casa da Borracha", "(21) 98170-3933", "contato@casadaborrachario.com.br", "Av. Mal. Floriano 30, Centro, RJ", "15.586.972/0001-87");
        Fornecedor Fornecedor10 = new Fornecedor(10, "Soluseg EPI ", "(11) 99380-2784", "ecommerce.soluseg@gmail.com", "Rua 2 367, Jardim Araucaria SP ", "51.857.319/0001-79");

        
        Estoque Estoque1 = new Estoque(1,"Luva", "Luva de Anti-Corte", 18);
        Estoque Estoque2 = new Estoque(2,"Capacete", "Capacete com abafador", 30);
        Estoque Estoque3 = new Estoque(3,"Oculos" ,"Oculos de proteção Anti-Embaçante", 15);
        Estoque Estoque4 = new Estoque(4, "Bota","Botas de PVC  cano curto ", 25);
        Estoque Estoque5 = new Estoque(5,"Mascara", "Máscara Hospitalar", 200);
        Estoque Estoque6 = new Estoque(6,"Máscara", "Semi-Facial ", 15);
        Estoque Estoque7 = new Estoque(7,"Luva", "Luvas de Raspa Punho Longo", 30);
        Estoque Estoque8 = new Estoque(8,"Bota", "Bota de PVC cano longo", 100);
        Estoque Estoque9 = new Estoque(9,"Roupa", "Macacão de Segurança ", 15);
        Estoque Estoque10 = new Estoque(10,"Cones", "Cones de sinalização 70 cm ", 20);

       
        
        //Adiciona Elementos na lista
        funcionario.add(Funcionario1);
        funcionario.add(Funcionario2);
        funcionario.add(Funcionario3);
        funcionario.add(Funcionario4);
        funcionario.add(Funcionario5);
        
        
        fornecedor.add(Fornecedor1);
        fornecedor.add(Fornecedor2);
        fornecedor.add(Fornecedor3);
        fornecedor.add(Fornecedor4);
        fornecedor.add(Fornecedor5);
        fornecedor.add(Fornecedor6);
        fornecedor.add(Fornecedor7);
        fornecedor.add(Fornecedor8);
        fornecedor.add(Fornecedor9);
        fornecedor.add(Fornecedor10);
        
        estoque.add(Estoque1);
        estoque.add(Estoque2);
        estoque.add(Estoque3);
        estoque.add(Estoque4);
        estoque.add(Estoque5);
        estoque.add(Estoque6);
        estoque.add(Estoque7);
        estoque.add(Estoque8);
        estoque.add(Estoque9);
        estoque.add(Estoque10);
        
      
    }
    
    
}

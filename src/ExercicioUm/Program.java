package ExercicioUm;

import java.util.Locale;
import java.util.Scanner;

import ExercicioUm.entities.Product;

public class Program {
	public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner entradaDados = new Scanner(System.in);
      Product product = new Product();
      
      
      System.out.println("SISTEMA CADASTRO PRODUTO");

      System.out.println("Enter product data: ");
      System.out.print("Name: ");
      product.name = entradaDados.nextLine();
      System.out.print("Price: ");
      product.price = entradaDados.nextDouble();
      System.out.print("Quantity in stock: ");
      product.quantity = entradaDados.nextInt();
      
      System.out.println();
      System.out.println("Product data: " + product);
      System.out.println();
      System.out.print("Enter the number of products to be added in stock: ");
      int quantity = entradaDados.nextInt();
      product.addProducts(quantity);
      System.out.println();
      System.out.println("Updated data: " + product);
      System.out.println();
      System.out.print("Enter the number of products to be removed from stock: ");
      quantity = entradaDados.nextInt();
      product.removeProducts(quantity);
      System.out.println();
      System.out.println("Updated data: " + product);
      
      entradaDados.close();
	}
}

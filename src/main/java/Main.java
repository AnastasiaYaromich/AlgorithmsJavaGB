public class Main {
    public static void main(String[] args) {
        Graph graph = new GraphImpl(10);
        graph.addVertex("Москва");
        graph.addVertex("Тула");
        graph.addVertex("Рязань");
        graph.addVertex("Калуга");
        graph.addVertex("Тамбов");
        graph.addVertex("Липецк");
        graph.addVertex("Орел");
        graph.addVertex("Саратов");
        graph.addVertex("Курск");
        graph.addVertex("Воронеж");

        graph.addEdge("Москва", "Тула", 174);
        graph.addEdge("Москва", "Калуга", 159);
        graph.addEdge("Москва", "Рязань", 184);
        graph.addEdge("Тула", "Липецк", 221);
        graph.addEdge("Рязань", "Тамбов", 239);
        graph.addEdge("Калуга", "Орел", 177);
        graph.addEdge("Липецк", "Воронеж", 108);
        graph.addEdge("Тамбов", "Саратов", 333);
        graph.addEdge("Орел", "Курск", 140);
        graph.addEdge("Саратов", "Воронеж", 466);
        graph.addEdge("Курск", "Воронеж", 211);

        graph.dfs("Москва");
        int sum1 = graph.shortDistanceCount("Москва", "Тула") + graph.shortDistanceCount("Тула", "Липецк") + graph.shortDistanceCount("Липецк", "Воронеж");
        int sum2 = graph.shortDistanceCount("Москва", "Рязань") + graph.shortDistanceCount("Рязань", "Тамбов")
                + graph.shortDistanceCount("Тамбов", "Саратов") + graph.shortDistanceCount("Саратов", "Воронеж");
        int sum3 = graph.shortDistanceCount("Москва", "Калуга") + graph.shortDistanceCount("Калуга", "Орел")
                + graph.shortDistanceCount("Орел", "Курск") + graph.shortDistanceCount("Курск", "Воронеж");
        int[] path = {sum1, sum2, sum3};
        minValue(path);
    }

    public static void minValue(int[] path) {
        int min = 0;
        for (int i = 0; i < path.length - 1; i++) {
            if(path[i] < path[i + 1]) {
                min = path[i];
            }
        }
        System.out.println("\n" + "Минимальное расстояние от Москвы до Воронежа: " + min + " км.");
    }
}

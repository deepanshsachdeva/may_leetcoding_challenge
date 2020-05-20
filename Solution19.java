class StockSpanner {
    Stack<int []> prices;
    
    public StockSpanner() {
        prices = new Stack<>();
    }
    
    public int next(int price) {
        int result = 1;
        
        while(!prices.isEmpty() && prices.peek()[0] <= price)
            result += prices.pop()[1];
        
        prices.push(new int[]{price, result});
        
        return result;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
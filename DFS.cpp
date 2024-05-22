#include <iostream>
#include <vector>

using namespace std;

void dfs(vector<vector<int>> &graph, int v, vector<bool> &visited) {
    visited[v] = true;
    cout << v << " ";

    for (int u : graph[v]) {
        if (!visited[u]) {
            dfs(graph, u, visited);
        }
    }
}

int main() {
    vector<vector<int>> graph = {
        {1, 2},
        {0, 3, 4},
        {0, 4},
        {1, 4, 5},
        {1, 2, 3},
        {3}
    };

    vector<bool> visited(graph.size(), false);

    cout << "DFS starting from node 0: ";
    dfs(graph, 0, visited);

    return 0;
}
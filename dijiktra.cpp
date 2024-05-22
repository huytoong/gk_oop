#include <iostream>
#include <vector>
#include <queue>
#include <limits>

using namespace std;

typedef pair<int, int> pii;

vector<int> dijkstra(vector<vector<pii>> &graph, int source) {
    int n = graph.size();
    vector<int> distance(n, numeric_limits<int>::max());
    priority_queue<pii, vector<pii>, greater<pii>> pq;

    distance[source] = 0;
    pq.push({0, source});

    while (!pq.empty()) {
        int u = pq.top().second;
        pq.pop();

        for (auto &neighbor : graph[u]) {
            int v = neighbor.first;
            int w = neighbor.second;

            if (distance[u] + w < distance[v]) {
                distance[v] = distance[u] + w;
                pq.push({distance[v], v});
            }
        }
    }

    return distance;
}

int main() {
    vector<vector<pii>> graph = {
        {{1, 2}, {2, 3}},
        {{2, 2}, {3, 3}},
        {{3, 1}},
        {}
    };

    vector<int> distance = dijkstra(graph, 0);

    for (int i = 0; i < distance.size(); ++i) {
        cout << "Shortest distance from node 0 to node " << i << " is " << distance[i] << endl;
    }

    return 0;
}
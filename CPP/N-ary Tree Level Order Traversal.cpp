/*
// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> children;

    Node() {}

    Node(int _val) {
        val = _val;
    }

    Node(int _val, vector<Node*> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
public:
    vector<vector<int>> levelOrder(Node* root) {
        vector<vector<int>>soln;
        if(root==NULL) return soln;
        vector<int>temp;
        queue<Node*>q;
        q.push(root);
        q.push(NULL);
        while(!q.empty()){
            Node* curr=q.front();
            q.pop();
            if(curr==NULL){
                soln.push_back(temp);
                if(q.empty()) break;
                temp.clear();
                q.push(NULL);
            }else{
                temp.push_back(curr->val);
                for(auto &x:curr->children) q.push(x);
            }
        }
        return soln;
    }
};

// Question: https://leetcode.com/problems/n-ary-tree-level-order-traversal/
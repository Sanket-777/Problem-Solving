class OrderedStream {
public:
    vector<string> st;
    int i = 0;

    OrderedStream(int n) {
        st.resize(n);
        
   }
    
    vector<string> insert(int idKey, string value) {
        vector<string > v;
        st[idKey - 1 ] = value;
        while(i < st.size() && st[i]!="")
        {
            v.push_back(st[i]);
            i++;
        }
        return v;
        }
};

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream* obj = new OrderedStream(n);
 * vector<string> param_1 = obj->insert(idKey,value);
 */
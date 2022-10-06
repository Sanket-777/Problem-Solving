 class TimeMap {
 public:
   //data members
 unordered_map<string, map<int, string>> t;

TimeMap() {
    
}

void set(string key, string value, int timestamp) {
    t[key][timestamp] = value;
}

string get(string key, int timestamp) {
    // Here on using upper bound code is gettting accepted
    if(t.find(key) == t.end()){
        return "";
    }
    
    auto it = t[key].upper_bound(timestamp);           
    if(it == t[key].begin()){
        return "";
    }
  
    it--;
    string ans = it->second;
    return ans;
}};
/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap* obj = new TimeMap();
 * obj->set(key,value,timestamp);
 * string param_2 = obj->get(key,timestamp);
 */
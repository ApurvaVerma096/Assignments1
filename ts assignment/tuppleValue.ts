            var tuple = {
             "person1": "Apurva",
                "person2": "Gargee",
                    "person3": "Bijoy"
            };



            function KeyValueTuple(val) {
                                 for (var i in tuple) {
                             if (i == val) {
                        return i + ": " + tuple[i];
        }
    }
                    return "not found!";
}
            console.log(KeyValueTuple("person1"));
            console.log(KeyValueTuple("person3"));
            console.log(KeyValueTuple("person5"));
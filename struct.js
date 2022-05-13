class ds {

constructor(newmap, newarr){
    this.map = newmap ?? new Map();
    this.arr = newarr ?? [];
}

    add = function(a) {
        if(this.map.get(a)) return;

        let size = this.arr.length;

        this.map.set(a, size);

        this.arr.push(a);

        console.log(this.arr[this.arr.length-1] === a)
    }

    remove = (a) => {

        if(!this.map.get(a)) return;

        let size = this.arr.length -1;

        let index = this.map.get(a);

        this.map.delete(a);

        let temp = this.arr[size];

        this.arr[index] = this.arr[size];

        this.arr[size] = temp;

        this.arr.pop();

        console.log(this.arr[this.arr.length-1] !== a)

    }

    search = (a) => {

        if(!this.map.get(a)) return;

        let index = this.map.get(a) ?? -1;

        console.log(index)

    }

    findRandom = () => {

        let random = Math.floor(Math.random() * this.arr.length-1);
        console.log(this.arr[random])
    }


}


let test = new ds();
let i = 30;
while(i-- > 0){
    test.add(i)
}
test.remove(6)
test.search(10);
test.findRandom();



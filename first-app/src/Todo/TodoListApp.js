import React,{Component} from 'react';
import './TodolistApp.css';
import ListItems from './ListItems';
class TodoListApp extends Component{
    constructor(props){
        super(props);
        this.state = {
          items:[],
          presentItem:{
            text:'',
            key:''
          }
        }
        this.addItem = this.addItem.bind(this);
        this.handleInput = this.handleInput.bind(this);
        this.deleteItem = this.deleteItem.bind(this);
        this.setUpdate = this.setUpdate.bind(this);
      }
      addItem(e){
        e.preventDefault();
        const newItem = this.state.presentItem;
        if(newItem.text !==""){
          const items = [...this.state.items, newItem];
        this.setState({
          items: items,
          presentItem:{
            text:'',
            key:''
          }
        })
        }
      }
      handleInput(e){
        this.setState({
          presentItem:{
            text: e.target.value,
            key: Date.now()
          }
        })
      }
      deleteItem(key){
        const dItems= this.state.items.filter(item =>
          item.key!==key);
        this.setState({
          items: dItems
        })
    
      }
      setUpdate(text,key){
        console.log("items:"+this.state.items);
        const items = this.state.items;
        items.map(item=>{      
          if(item.key===key){
            console.log(item.key +"    "+key)
            item.text= text;
          }
        })
        this.setState({
          items: items
        })
        
       
      }
     render(){
      return (
        <div className="App">
            <h2>To-do List</h2>
          <header>
              <img src="./images/todo.jpg"/>
            <form id="to-do-form" onSubmit={this.addItem}>
              <input type="text" placeholder="Enter task" value= {this.state.presentItem.text} 
              onChange={this.handleInput}></input>
              <button type="submit">Add</button>
            </form>
            <p>{this.state.items.text}</p>
            
              <ListItems items={this.state.items} deleteItem={this.deleteItem} setUpdate={this.setUpdate}/>
            
          </header>
        </div>
      );
     }
    }
    
    
    export default TodoListApp;
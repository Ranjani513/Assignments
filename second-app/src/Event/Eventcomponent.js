import React from 'react';
class Eventcomponent extends React.Component
{
    constructor(props)
    {
        super(props)
        {
            
        }
        
    }
    render()
    {
        return(
            <React.Fragment>
                <button onClick={()=>this.props.onClick()}>Submit</button>
                
            </React.Fragment>
        )
    }

}
export default Eventcomponent;
import React from 'react';
import {render} from 'react-dom';

class StaffList extends React.Component {
    render() {

    	console.log(this.props);
    	
        var stafflist = Object.values(this.props.staffs).map(staffObject =>
            <Staff staffObject = {JSON.parse(staffObject)}/>
        );

        return(
            <table>
                <thead>
                    <tr>
                        <th>IDNumber</th>
                        <th>PersonName</th>
                        <th>ShiftHours</th>
                        <th>Position</th>
                     
                    </tr>
                </thead>
                <tbody>
                    {stafflist}
                </tbody>
            </table>
        );
    }
}

class Staff extends React.Component {
    render() {
        return(
            <tr id={"staff-"+this.props.staffObject['IDNumbers']}>
            	<td>{this.props.staffObject['IDNumber']}</td>
                <td>{this.props.staffObject['PersonName']}</td>
                <td>{this.props.staffObject['ShiftHours']}</td>
                <td>{this.props.staffObject['Position']}</td>
            </tr>
        );
    }
}

class View extends React.Component {

    getStaffList() {
    	var list = {};
    	
        $.ajax({
            method: "GET",
            async: false,
            url: "./api/staff",
        }).done(function(msg) {
        	console.log(msg);
            list = JSON.parse(msg);
        });
        
        return list;
}

    render() {
    
    	
        return( 
            <StaffList staffs = {this.getStaffList()} />
        );
    }
}

render(<View />, document.getElementById('target'));
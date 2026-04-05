import Proptypes from 'prop-types';
function UserGreetings(props) {
    // if(props.isLogeedIn){
    //     return <h2>Welcome {props.userName}!</h2>
    // }else{
    //     return <h2>Please log in to continue.</h2>
    // }
    const welcomeMessage = <h2 className="welcome-message">Welcome {props.userName}!</h2>;
    const loginPrompt = <h2 className="login-prompt">Please log in to continue.</h2>;
    return props.isLoggedin ? welcomeMessage : loginPrompt;
}
UserGreetings.propTypes = {
    isLoggedin: Proptypes.bool,
    userName: Proptypes.string
};
export default UserGreetings;
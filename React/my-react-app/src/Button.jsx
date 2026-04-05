function Button() {
    
    const handleClick = (e) => {
        e.target.textContent = "OOUCH! 🤕";
    }
    return (<button onDoubleClick={(e ) => handleClick(e)}>Click me &#128512;</button>);
}
export default Button;

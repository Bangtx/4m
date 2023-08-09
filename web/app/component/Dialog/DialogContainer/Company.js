import DialogContainer from './index'


const CompanyDialog = ({show, onClose, title}) => {
    return (
        <DialogContainer show={show} onClose={onClose} title={title}></DialogContainer>
    )
}

export default CompanyDialog
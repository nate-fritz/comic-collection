import events from './utils/events/event-actions'
import api from './utils/api/api-actions'

import Publishers from './components/Publishers'

main()

function main() {
    api.getRequest('/publishers', publishers => {
        getAppContext().innerHTML = Publishers(publishers);
    })

    events.on(getAppContext(), 'click', () => {
        if (event.target.classList.contains('add-publisher__submit')) {
            const publisherName = document.querySelector('.add-publisher__publisher-name').value
            const rating = document.querySelector('.add-publisher__rating').value

            api.postRequest('/publishers/add', {
                publisherName: publisherName,
                rating: rating
            }, (publishers) => getAppContext().innerHTML = Publishers(publishers))
        }
    })
}

function getAppContext() {
    return document.querySelector("#app")
}
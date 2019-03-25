import Items from './Items'

export default function Publishers(publishers) {
    return `
        <ul class="publishers">
            ${publishers.map(publisher => {
                return `
                <li class="publisher">
                <h3 class="publisher__name">${publisher.publisherName}</h3>
                <ul class="items">
                    ${Items(publisher.items)}
                </ul>
                </li>
            `;
    }).join('')}
        </ul>
        <section class="add-publisher">
            <input type="text" class="add-publisher__publisher-name" placeholder="Name of Publisher">
            <button class="add-publisher__submit">Add Publisher</button>
        </section>
    `;
}
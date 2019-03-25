export default function Items(items) {
    return items
        .map(item => {
            return `
                <li class="item">
                    <h5 class="item__name">${item.itemName}</h5>
                    <p class="item__description">${item.description}</p>
                </li>
            `;
        }).join('')
}
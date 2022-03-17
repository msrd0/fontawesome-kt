/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID

/** Trowel Bricks */
object FA_TROWEL_BRICKS: Icon {
	
	override val name get() = "Trowel Bricks"
	
	override val unicode get() = "e58a"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M240.8 4.779C250.3 10.61 256 20.91 256 32V104H345C348.6 90.2 361.1 80 376 80H464C490.5 80 512 101.5 512 128C512 154.5 490.5 176 464 176H376C361.1 176 348.6 165.8 345 152H256V224C256 235.1 250.3 245.4 240.8 251.2C231.4 257.1 219.6 257.6 209.7 252.6L17.69 156.6C6.848 151.2 0 140.1 0 128C0 115.9 6.848 104.8 17.69 99.38L209.7 3.378C219.6-1.581 231.4-1.051 240.8 4.779V4.779zM288 256C288 238.3 302.3 224 320 224H480C497.7 224 512 238.3 512 256V320C512 337.7 497.7 352 480 352H320C302.3 352 288 337.7 288 320V256zM128 384C145.7 384 160 398.3 160 416V480C160 497.7 145.7 512 128 512H32C14.33 512 0 497.7 0 480V416C0 398.3 14.33 384 32 384H128zM480 384C497.7 384 512 398.3 512 416V480C512 497.7 497.7 512 480 512H224C206.3 512 192 497.7 192 480V416C192 398.3 206.3 384 224 384H480z"/></svg>"""
		else -> null
	}
	
}

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

/** Kitchen Set */
object FA_KITCHEN_SET: Icon {
	
	override val name get() = "Kitchen Set"
	
	override val unicode get() = "e51a"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M80 144C80 108.7 108.7 80 144 80C179.3 80 208 108.7 208 144C208 179.3 179.3 208 144 208C108.7 208 80 179.3 80 144zM284.4 176C269.9 240.1 212.5 288 144 288C64.47 288 0 223.5 0 144C0 64.47 64.47 0 144 0C212.5 0 269.9 47.87 284.4 112H356.2C365 102.2 377.8 96 392 96H496C522.5 96 544 117.5 544 144C544 170.5 522.5 192 496 192H392C377.8 192 365 185.8 356.2 176H284.4zM144 48C90.98 48 48 90.98 48 144C48 197 90.98 240 144 240C197 240 240 197 240 144C240 90.98 197 48 144 48zM424 264V272H520C533.3 272 544 282.7 544 296C544 309.3 533.3 320 520 320H280C266.7 320 256 309.3 256 296C256 282.7 266.7 272 280 272H376V264C376 250.7 386.7 240 400 240C413.3 240 424 250.7 424 264zM288 464V352H512V464C512 490.5 490.5 512 464 512H336C309.5 512 288 490.5 288 464zM176 320C202.5 320 224 341.5 224 368C224 394.5 202.5 416 176 416H160C160 433.7 145.7 448 128 448H64C46.33 448 32 433.7 32 416V336C32 327.2 39.16 320 48 320H176zM192 368C192 359.2 184.8 352 176 352H160V384H176C184.8 384 192 376.8 192 368zM200 464C213.3 464 224 474.7 224 488C224 501.3 213.3 512 200 512H24C10.75 512 0 501.3 0 488C0 474.7 10.75 464 24 464H200z"/></svg>"""
		else -> null
	}
	
}

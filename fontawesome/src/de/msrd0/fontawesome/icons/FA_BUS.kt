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

/** Bus */
object FA_BUS: Icon {
	
	override val name get() = "Bus"
	
	override val unicode get() = "f207"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M288 0C422.4 0 512 35.2 512 80V128C529.7 128 544 142.3 544 160V224C544 241.7 529.7 256 512 256L512 416C512 433.7 497.7 448 480 448V480C480 497.7 465.7 512 448 512H416C398.3 512 384 497.7 384 480V448H192V480C192 497.7 177.7 512 160 512H128C110.3 512 96 497.7 96 480V448C78.33 448 64 433.7 64 416L64 256C46.33 256 32 241.7 32 224V160C32 142.3 46.33 128 64 128V80C64 35.2 153.6 0 288 0zM128 256C128 273.7 142.3 288 160 288H272V128H160C142.3 128 128 142.3 128 160V256zM304 288H416C433.7 288 448 273.7 448 256V160C448 142.3 433.7 128 416 128H304V288zM144 400C161.7 400 176 385.7 176 368C176 350.3 161.7 336 144 336C126.3 336 112 350.3 112 368C112 385.7 126.3 400 144 400zM432 400C449.7 400 464 385.7 464 368C464 350.3 449.7 336 432 336C414.3 336 400 350.3 400 368C400 385.7 414.3 400 432 400zM368 64H208C199.2 64 192 71.16 192 80C192 88.84 199.2 96 208 96H368C376.8 96 384 88.84 384 80C384 71.16 376.8 64 368 64z"/></svg>"""
		else -> null
	}
	
}

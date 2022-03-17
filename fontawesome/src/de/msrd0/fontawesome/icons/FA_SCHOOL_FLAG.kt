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

/** School Flag */
object FA_SCHOOL_FLAG: Icon {
	
	override val name get() = "School Flag"
	
	override val unicode get() = "e56e"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M288 0H400C408.8 0 416 7.164 416 16V64C416 72.84 408.8 80 400 80H320V95.53L410.3 160H512C547.3 160 576 188.7 576 224V448C576 483.3 547.3 512 512 512H336V400C336 373.5 314.5 352 288 352C261.5 352 240 373.5 240 400V512H64C28.65 512 0 483.3 0 448V224C0 188.7 28.65 160 64 160H165.7L256 95.53V32C256 14.33 270.3 0 288 0V0zM288 192C261.5 192 240 213.5 240 240C240 266.5 261.5 288 288 288C314.5 288 336 266.5 336 240C336 213.5 314.5 192 288 192zM80 224C71.16 224 64 231.2 64 240V304C64 312.8 71.16 320 80 320H112C120.8 320 128 312.8 128 304V240C128 231.2 120.8 224 112 224H80zM448 304C448 312.8 455.2 320 464 320H496C504.8 320 512 312.8 512 304V240C512 231.2 504.8 224 496 224H464C455.2 224 448 231.2 448 240V304zM80 352C71.16 352 64 359.2 64 368V432C64 440.8 71.16 448 80 448H112C120.8 448 128 440.8 128 432V368C128 359.2 120.8 352 112 352H80zM464 352C455.2 352 448 359.2 448 368V432C448 440.8 455.2 448 464 448H496C504.8 448 512 440.8 512 432V368C512 359.2 504.8 352 496 352H464z"/></svg>"""
		else -> null
	}
	
}

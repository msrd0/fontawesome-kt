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

object FA_MOBILE_RETRO: Icon {
	
	override val name get() = "Mobile Retro"
	
	override val unicode get() = "e527"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512"><path d="M0 64C0 28.65 28.65 0 64 0H256C291.3 0 320 28.65 320 64V448C320 483.3 291.3 512 256 512H64C28.65 512 0 483.3 0 448V64zM64 232C64 245.3 74.75 256 88 256H232C245.3 256 256 245.3 256 232V152C256 138.7 245.3 128 232 128H88C74.75 128 64 138.7 64 152V232zM80 352C93.25 352 104 341.3 104 328C104 314.7 93.25 304 80 304C66.75 304 56 314.7 56 328C56 341.3 66.75 352 80 352zM80 384C66.75 384 56 394.7 56 408C56 421.3 66.75 432 80 432C93.25 432 104 421.3 104 408C104 394.7 93.25 384 80 384zM160 352C173.3 352 184 341.3 184 328C184 314.7 173.3 304 160 304C146.7 304 136 314.7 136 328C136 341.3 146.7 352 160 352zM160 384C146.7 384 136 394.7 136 408C136 421.3 146.7 432 160 432C173.3 432 184 421.3 184 408C184 394.7 173.3 384 160 384zM240 352C253.3 352 264 341.3 264 328C264 314.7 253.3 304 240 304C226.7 304 216 314.7 216 328C216 341.3 226.7 352 240 352zM240 384C226.7 384 216 394.7 216 408C216 421.3 226.7 432 240 432C253.3 432 264 421.3 264 408C264 394.7 253.3 384 240 384zM128 48C119.2 48 112 55.16 112 64C112 72.84 119.2 80 128 80H192C200.8 80 208 72.84 208 64C208 55.16 200.8 48 192 48H128z"/></svg>"""
		else -> null
	}
	
}

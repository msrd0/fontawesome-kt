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

object FA_FACE_MASK: Icon {
	
	override val name get() = "Face Mask"
	
	override val unicode get() = "e1d7"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M396.4 87.12L433.5 111.9C449.3 122.4 467.8 128 486.8 128H584C614.9 128 640 153.1 640 184V269C640 324.1 602.5 372.1 549.1 385.5L441.1 412.5C406.2 434.1 364.6 448 320 448C275.4 448 233.8 434.1 198.9 412.5L90.9 385.5C37.48 372.1 0 324.1 0 269V184C0 153.1 25.07 128 56 128H153.2C172.2 128 190.7 122.4 206.5 111.9L243.6 87.12C266.2 72.05 292.8 64 320 64C347.2 64 373.8 72.05 396.4 87.12zM132.3 346.3C109.4 311.2 96 269.1 96 224V176H56C51.58 176 48 179.6 48 184V269C48 302.1 70.49 330.9 102.5 338.9L132.3 346.3zM592 269V184C592 179.6 588.4 176 584 176H544V224C544 269.1 530.6 311.2 507.7 346.3L537.5 338.9C569.5 330.9 592 302.1 592 269H592zM208 224H432C440.8 224 448 216.8 448 208C448 199.2 440.8 192 432 192H208C199.2 192 192 199.2 192 208C192 216.8 199.2 224 208 224zM208 256C199.2 256 192 263.2 192 272C192 280.8 199.2 288 208 288H432C440.8 288 448 280.8 448 272C448 263.2 440.8 256 432 256H208zM240 352H400C408.8 352 416 344.8 416 336C416 327.2 408.8 320 400 320H240C231.2 320 224 327.2 224 336C224 344.8 231.2 352 240 352z"/></svg>"""
		else -> null
	}
	
}
